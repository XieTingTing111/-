package com.example.middleexam


data class News(
    val id:Int,
    val title:String,
    val content:String,
    val publish:String,
    val data:String
)
data class Novel(
    val id:Int,
    val title:String,
    val type:String,
    val status:String,
    val author:String
)

object UserData{
    var NewsList= mutableListOf(
        News(1,"titleA","1","泉州海洋职业学院出版社","2024-05-09"),
        News(2,"titleB","2","南京大学出版社","2024-05-09"),
        News(3,"titleC","3","武汉大学出版社","2024-05-09"),
        News(4,"titleD","4","厦门大学出版社","2024-05-09"),
        News(5,"titleE","5","传媒大学出版社","2024-05-09"),
    )
    val NovelList = mutableListOf(
        Novel(1,"告白","言情","可读","作者1"),
        Novel(2,"宠婚","青春文学","可读","作者2"),
        Novel(3,"射雕英雄","武侠","可读","作者3"),
        Novel(4,"花千骨","仙侠","可读","作者4"),
        Novel(5,"难哄","都市","可读","作者5"),
        Novel(6,"无限列车","科幻","可读","作者6"),
    )
}