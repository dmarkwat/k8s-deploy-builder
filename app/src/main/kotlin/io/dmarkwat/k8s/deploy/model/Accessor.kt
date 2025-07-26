package org.example.app.io.dmarkwat.k8s.deploy.model

sealed interface Accessor {
    sealed interface Cardinality {}
    data class Bounded(val n: UInt) : Cardinality
    object Unbounded : Cardinality

    class Unary(override val key: String) : Accessor {
        override val cardinality: Cardinality = Bounded(1u)

        override fun extract(set: DescriptorSet): List<Descriptor> = listOf(apply(set))

        fun apply(set: DescriptorSet): Descriptor = TODO()
    }
    class Binary(override val key: String) : Accessor {
        override val cardinality: Cardinality = Bounded(2u)

        override fun extract(set: DescriptorSet): List<Descriptor> {
            TODO("Not yet implemented")
        }
    }
    class Nary private constructor(override val key: String, override val cardinality: Cardinality) : Accessor {
        constructor(key: String) : this(key, Unbounded)
        constructor(key: String, n: UInt) : this(key, Bounded(n))

        override fun extract(set: DescriptorSet): List<Descriptor> {
            TODO("Not yet implemented")
        }
    }

    val key: String
    val cardinality: Cardinality
    fun extract(set: DescriptorSet): List<Descriptor>
}
