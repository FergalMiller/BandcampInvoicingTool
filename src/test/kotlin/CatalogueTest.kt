import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test

class CatalogueTest {

    private lateinit var catalogue: Catalogue

    @BeforeEach
    fun setUp() {
        catalogue = Catalogue()
    }

    @Test
    fun test() {

        catalogue.addReleaseToCatalog(getComplexCompilationRelease())

    }

    private fun getComplexCompilationRelease(): Release {

        val track1 = Track("Rumble", Split.customSplit("Skrillex" to 40f, "Fred Again..." to 60f))
        val track2 = Track("Big Ol' Collab Track", Split.evenSplit("Kendrick", "J Cole", "Schoolboy Q"))
        val track3 = Track("Mayonnaise", Split.singleSplit("Bob Dylan"))

        val expenses: MutableList<Expense> = mutableListOf(
            Expense(60_00, "Track Mastering"),
            Expense(100_00, "Artwork")
        )

        return Release("COMPLEX001", setOf(track1, track2, track3), expenses)
    }
}