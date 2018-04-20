package io.access.kotlintraining

/*
* Java
*
*
* public void sendMessageToClient(
    @Nullable Client client,
    @Nullable String message,
    @NonNull Mailer mailer) {
    if (client == null || message == null) return;

    PersonalInfo personalInfo = client.getPersonalInfo();
    if (personalInfo == null) return;

    String email = personalInfo.getEmail();
    if (email == null) return;

    mailer.sendMessage(email, message);
}
* */

fun sendMessageToClient(client: Client?, message: String?, mailer: Mailer) {
    if (message == null) return
    val personalInfo = client?.personalInfo
    var email = personalInfo?.email?.let {
        mailer.sendMessage(it, message)
    }
}

// コンパイル通すための諸々
class Client (val personalInfo: PersonalInfo?)
class PersonalInfo (val email: String?)
interface Mailer {
    fun sendMessage(email: String, message: String)
}
