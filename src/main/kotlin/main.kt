import java.time.LocalDateTime

fun main() {

    WallService.add(Post(0, 222999, LocalDateTime.now(), "Hello!"))
    WallService.add(Post(0, 222999, LocalDateTime.now(), "Meow"))
    WallService.update(Post(1, 222999, LocalDateTime.now(), "Hi"))
    WallService.printPosts()
}
