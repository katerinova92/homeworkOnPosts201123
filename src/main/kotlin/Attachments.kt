class AudioAttachment(
    override val type: String = "audio",
    val audio: Audio
) : Attachment

class Audio(
    val name: String,
    val singerName: String,
    val releaseYear: Int,
    val duration: Int,
    val trackID: Int
)

class VideoAttachment(
    override val type: String = "video",
    val video: Video
) : Attachment

class Video(
    val name: String,
    val description: String,
    val ownerID: Int,
    val duration: Int,
    val videoID: Int
)

class PhotoAttachment(
    override val type: String = "photo",
    val image: Photo
) : Attachment

class Photo(
    val imageURL: String,
    val ownerID: Int,
    val height: Int,
    val width: Int,
    val videoID: Int
)