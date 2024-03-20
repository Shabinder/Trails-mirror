package org.mobilenativefoundation.trails.common.networking.api.models

import kotlinx.serialization.Serializable

@Serializable
data class GetReviewsArgs(
    val trailId: String,
    val limit: Int,
    val cursor: String?
)
