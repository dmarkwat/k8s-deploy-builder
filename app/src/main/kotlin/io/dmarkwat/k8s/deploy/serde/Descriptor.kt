package org.example.app.io.dmarkwat.k8s.deploy.serde

import kotlinx.serialization.Serializable

@Serializable
data class Descriptor(val key: String, val values: List<String>)
