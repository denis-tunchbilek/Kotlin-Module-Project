interface ViewInterface {
    val title: String
    val mapOfMenu: MutableMap<String, () -> Unit>

    fun prepareToView ()
}

interface CreateInterface {
    val title: String
    var tempData: String
    val backToMenu: () -> Unit

    fun createFromInput ()
}