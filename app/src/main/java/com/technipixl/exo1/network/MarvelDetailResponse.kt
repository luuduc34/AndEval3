package com.technipixl.exo1.network

data class MarvelDetailResponse (
    val data: DataDetailResponse
)
data class DataDetailResponse(
    val results: List<CharacterDetail>
)
data class CharacterDetail(
    val id: String,
    val name: String,
    val thumbnail: Thumbnail
)