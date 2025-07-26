package org.example.app.io.dmarkwat.k8s.deploy.serde

import kotlinx.serialization.Serializable

@Serializable
data class Site(val descriptors: DescriptorSet)
