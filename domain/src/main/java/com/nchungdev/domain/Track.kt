package com.nchungdev.domain

data class Track(
    val id: Long,
    val title: String,
    val link: String,
    val duration: Long,
    val preview: String,
    val artist: Artist,
    val album: Album
)
