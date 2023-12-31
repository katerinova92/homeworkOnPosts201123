import org.junit.Assert.assertEquals
import org.junit.Before
import org.junit.Test
import java.time.LocalDateTime

class AutotestsForPosts {

    @Before
    fun clearBeforeTest() {
        WallService.clear()
    }

    @Test
    fun postAddAutotest() {
        val testPost = Post(0, 222999, LocalDateTime.now(), "Test text")
        val wallSize = WallService.wallSizeCounting()

        WallService.add(testPost)

        val newWallSize = WallService.wallSizeCounting()

        assertEquals(wallSize + 1, newWallSize)
    }

    @Test
    fun updatePostAutotestForExistentID() {
        WallService.add(Post(0, 222999, LocalDateTime.now(), "Test text"))
        WallService.add(Post(0, 222999, LocalDateTime.now(), "Test text 2"))

        assertEquals(WallService.update(Post(2, 222999, LocalDateTime.now(), "New text")), true)
    }

    @Test
    fun updatePostAutotestForNonexistentID() {
        WallService.add(Post(0, 222999, LocalDateTime.now(), "Test text"))
        WallService.add(Post(0, 222999, LocalDateTime.now(), "Test text 2"))

        assertEquals(WallService.update(Post(3, 222999, LocalDateTime.now(), "New text")), false)
    }

    @Test
    fun createCommentForExistentPost() {
        WallService.add(Post(0, 222999, LocalDateTime.now(), "Test text"))
        WallService.add(Post(0, 222999, LocalDateTime.now(), "Test text 2"))
        WallService.createComment(1, Comment(1, 555342, LocalDateTime.now(), 1, "New comment!"))
    }

    @Test(expected = PostNotFoundException::class)
    fun shouldThrow() {
        WallService.add(Post(0, 222999, LocalDateTime.now(), "Test text"))
        WallService.add(Post(0, 222999, LocalDateTime.now(), "Test text 2"))
        WallService.createComment(3, Comment(1, 555342, LocalDateTime.now(), 3, "New comment!"))
    }
}

