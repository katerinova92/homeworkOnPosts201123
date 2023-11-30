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
        val testPost = Post(0, 222999, LocalDateTime.now(), "Test text", null)
        val wallSize = WallService.wallSizeCounting()

        WallService.add(testPost)

        val newWallSize = WallService.wallSizeCounting()

        assertEquals(wallSize + 1, newWallSize)
    }

    @Test
    fun updatePostAutotestForExistentID() {
        WallService.add(Post(0, 222999, LocalDateTime.now(), "Test text", null))
        WallService.add(Post(0, 222999, LocalDateTime.now(), "Test text 2", null))

        assertEquals(WallService.update(Post(2, 222999, LocalDateTime.now(), "New text", null)), true)
    }

    @Test
    fun updatePostAutotestForNonexistentID() {
        WallService.add(Post(0, 222999, LocalDateTime.now(), "Test text", null))
        WallService.add(Post(0, 222999, LocalDateTime.now(), "Test text 2", null))

        assertEquals(WallService.update(Post(3, 222999, LocalDateTime.now(), "New text", null)), false)
    }
}

