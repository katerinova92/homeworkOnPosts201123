import java.time.LocalDateTime

data class Comment(
    val commentID: Int,
    val commentAuthorID: Int,
    val commentCreationDate: LocalDateTime,
    val commentedPostID: Int,
    val text: String,
    val attachments: Array<Attachment> = emptyArray(),
    val likes: Likes = Likes(0)
)