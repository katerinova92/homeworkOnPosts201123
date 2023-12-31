object WallService {
    private var posts = emptyArray<Post>()
    private var lastPostID = 0
    private var comments = emptyArray<Comment>()

    fun add(post: Post): Post {
        posts += post.copy(
            postID = ++lastPostID,
            likes = post.likes.copy(),
            comments = post.comments.copy(),
            reposts = post.reposts.copy()
        )
        return posts.last()
    }

    fun update(newPost: Post): Boolean {
        for ((index, post) in posts.withIndex()) {
            if (post.postID == newPost.postID) {
                posts[index] = newPost.copy(
                    likes = post.likes.copy(),
                    comments = post.comments.copy(),
                    reposts = post.reposts.copy()
                )
                return true
            }
        }
        return false
    }

    fun createComment(postId: Int, comment: Comment): Comment {
        for (post in posts) {
            if (post.postID == postId) {
                comments += comment
                return comment
            }
        }
        throw PostNotFoundException("Post with ID $postId not found!")
    }

    fun wallSizeCounting() = posts.size

    fun clear() {
        posts = emptyArray()
        lastPostID = 0
    }

    fun printPosts() {
        for (post in posts) {
            println(post)
            println("\n")
        }
    }
}