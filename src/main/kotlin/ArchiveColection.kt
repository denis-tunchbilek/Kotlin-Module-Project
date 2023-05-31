import kotlin.system.exitProcess

class MenuArchiveCollectionView () : ViewInterface {
    override val title: String = "меню имеющихся архивов"
    override val mapOfMenu: MutableMap<String, () -> Unit> = mutableMapOf()

    override fun prepareToView() {
        mapOfMenu["Создать архив"] = {menu.showCreateMenu(CreateArchive())}
        for (key in NoteArchiveCollection.noteArchiveCollection.keys) {
            mapOfMenu[NoteArchiveCollection.noteArchiveCollection[key]!!.name] = {menu.showViewMenu(ViewArchive(key))}
        }
        mapOfMenu["Выход"] = { exitProcess(0) }
    }

}