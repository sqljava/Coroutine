package uz.ictschool.coroutine

data class CommentList(
    val comments: List<Comment>,
    val limit: Int,
    val skip: Int,
    val total: Int
)