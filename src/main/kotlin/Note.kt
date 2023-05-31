data class Note (
    val textOfNote: String
) {

}


class ViewNote (val key: Int, val text: String) : CreateInterface {
    override val title = "Введите 1 для выхода"
    override var tempData = ""
    override val backToMenu: () -> Unit = {menu.showViewMenu(ViewArchive(key))}

    override fun createFromInput() {
        do {
            println("Текст заметки:")
            println(text)
            println("")
            println(title)
            tempData = menu.getUserInput()
        } while (tempData != "1")
        backToMenu.invoke()
    }



}



class NoteArchive(
    val name: String,
    val noteArchive: MutableMap<Int, Note> = mutableMapOf()
) {
    fun addToNoteArchive (str: String) {
        noteArchive[(noteArchive.size + 1)] = Note(str)
    }

}

object NoteArchiveCollection {

    val noteArchiveCollection: MutableMap<Int, NoteArchive> = mutableMapOf()

    fun addToCollection (name: String) {
        noteArchiveCollection[noteArchiveCollection.size] = NoteArchive(name)
    }

}