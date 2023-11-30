import java.time.LocalDateTime

fun main() {

    WallService.add(Post(0, 222999, LocalDateTime.now(), "Hello!", null))
    WallService.add(Post(0, 222999, LocalDateTime.now(), "Meow", null))
    WallService.update(Post(1, 222999, LocalDateTime.now(), "Hi", null))
    WallService.printPosts()
}
