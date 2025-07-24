package org.example.app.io.dmarkwat.k8s.deploy.model

data class Site()

class ListMultiMap<K, V>(m: Map<K, List<V>>, c: () -> List<V>) : Map<K, List<V>> by m {
    override fun getOrDefault(key: K, defaultValue: List<V>): List<V> {
        return super.getOrDefault(key, defaultValue)
    }
}

data class DescriptorSet(val descriptors: Map<String, List<String>>)
