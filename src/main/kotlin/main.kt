import java.time.LocalDateTime

fun main() {

    WallService.add(Post(0, 222999, LocalDateTime.now(), "Hello!"))
    WallService.add(Post(0, 222999, LocalDateTime.now(), "Meow"))
    WallService.update(Post(1, 222999, LocalDateTime.now(), "Hi"))
    WallService.printPosts()

    val newComment = Comment(1, 555342, LocalDateTime.now(), 1, "New comment!")
    WallService.createComment(3, newComment)
}
