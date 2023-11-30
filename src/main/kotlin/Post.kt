import java.time.LocalDateTime

data class Post(
    val postID: Int,
    val fromID: Int,
    val date: LocalDateTime,
    val text: String,
    val original: Post?,
    val attachments: Array<Attachment> = emptyArray(),
    val likes: Likes = Likes(0),
    val comments: Comments = Comments(0),
    val reposts: Reposts = Reposts(0),
    val isPinned: Boolean = false,
    val friendsOnly: Boolean = false,
    val markedAsAds: Boolean = false
) {

}