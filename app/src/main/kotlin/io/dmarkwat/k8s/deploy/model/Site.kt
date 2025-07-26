package org.example.app.io.dmarkwat.k8s.deploy.model

data class Site(val identity: DescriptorSet, val ancillary: DescriptorSet)

data class DescriptorSet(val m: Set<Descriptor>) : Set<Descriptor> by m {
    constructor(d: List<Descriptor>): this(d.toSet()) {
        require(d.size == m.size) { "DescriptorSets must not contain duplicate keys" }
    }
}
