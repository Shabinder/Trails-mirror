package org.mobilenativefoundation.trails.common.networking.api.models

import kotlinx.serialization.Serializable

@Serializable
data class Review(
    val id: String,
    val userId: String,
    val trailId: String,
    val rating: Int,
    val comment: String,
    val createdAt: Long,
    val updatedAt: Long
)