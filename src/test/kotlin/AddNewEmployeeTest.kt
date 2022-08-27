import org.junit.jupiter.api.Assertions.assertTrue
import org.junit.jupiter.api.Test

class AddNewEmployeeTest {

    @Test
    internal fun addNewEmployee() {
        // Arrange
        val id = "1"
        val isIntern = false
        val dummyManagerNotifier = DummyManagerNotifier()

        // Act
        addNewEmployee(id, isIntern, dummyManagerNotifier)

        // Assert
        assertTrue(true)
    }
}

private fun addNewEmployee(id: String, isIntern: Boolean, managerNotifier: ManagerNotifier) {
    if (!isIntern) {
        managerNotifier.notifyInternHasBeenAdded(id)
    }

    // Add new employee
}

class DummyManagerNotifier : ManagerNotifier {
    override fun notifyInternHasBeenAdded(id: String) {
        throw Exception("Dummy must not been used !")
    }
}

interface ManagerNotifier {
    fun notifyInternHasBeenAdded(id: String)
}
