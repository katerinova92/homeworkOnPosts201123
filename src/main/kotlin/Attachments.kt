class AudioAttachment(
    override val type: Audio
) : Attachment {
}

class Audio(
    override val type: Audio,
    val name: String,
    val singerName: String,
    val releaseYear: Int,
    val duration: Int,
    val trackID: Int
) : Attachment {
}


class VideoAttachment(
    override val type: Video
) : Attachment {
}

class Video(
    override val type: Video,
    val name: String,
    val description: String,
    val ownerID: Int,
    val duration: Int,
    val videoID: Int
) : Attachment {
}


class PhotoAttachment(
    override val type: Photo
) : Attachment {
}

class Photo(
    override val type: Photo,
    val imageURL: String,
    val ownerID: Int,
    val height: Int,
    val width: Int,
    val videoID: Int
) : Attachment {
}