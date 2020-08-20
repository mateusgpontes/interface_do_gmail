package com.example.interface_gmail.model

data class Email(
    val user: String,
    val subject: String,
    val preview: String,
    val date: String,
    val stared: Boolean,
    val unread: Boolean,
    val selected:Boolean = false
)

class EmailBuilder{
    var user: String = ""
    var subject: String = ""
    var preview: String = ""
    var date: String = ""
    var stared: Boolean = false
    var unread: Boolean = false

    fun build() : Email = Email(user, subject, preview, date, stared, unread, false)
}

fun email(block: EmailBuilder.() -> Unit): Email = EmailBuilder().apply(block).build()

fun fakeEmails():MutableList<Email> = mutableListOf(
    email{
        user = "Facebook"
        subject = "Um amigo te convidou para curtir uma página"
        preview = "Fulano convidou você para curtir a página tal"
        date = "15 aug"
        stared = false
    },
    email{
        user = "Youtube"
        subject = "Veja os videos que estão bombando no em alta"
        preview = "Os videos mais famosos do youtube"
        date = "13 aug"
        stared = false
    },
    email{
        user = "Instagram"
        subject = "Veja algumas das nosass dicas para conseguir mais curtidas"
        preview = "Olá Fulano, você pode ter dicas de como ter mais curtidas"
        date = "10 aug"
        stared = true
    },
    email{
        user = "Facebook"
        subject = "Um amigo te convidou para curtir uma página"
        preview = "Fulano convidou você para curtir a página tal"
        date = "15 aug"
        stared = false
    },
    email{
        user = "Youtube"
        subject = "Veja os videos que estão bombando no em alta"
        preview = "Os videos mais famosos do youtube"
        date = "13 aug"
        stared = false
    },
    email{
        user = "Instagram"
        subject = "Veja algumas das nosass dicas para conseguir mais curtidas"
        preview = "Olá Fulano, você pode ter dicas de como ter mais curtidas"
        date = "10 aug"
        stared = true
    },
    email{
        user = "Facebook"
        subject = "Um amigo te convidou para curtir uma página"
        preview = "Fulano convidou você para curtir a página tal"
        date = "15 aug"
        stared = false
    },
    email{
        user = "Youtube"
        subject = "Veja os videos que estão bombando no em alta"
        preview = "Os videos mais famosos do youtube"
        date = "13 aug"
        stared = false
    },
    email{
        user = "Instagram"
        subject = "Veja algumas das nosass dicas para conseguir mais curtidas"
        preview = "Olá Fulano, você pode ter dicas de como ter mais curtidas"
        date = "10 aug"
        stared = true
    }
)
