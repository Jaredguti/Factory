public class SMSNotificacion  implements  Notificacion{
    @Override
    public void enviarMensaje(String mensaje) {
        System.out.println("Enviando SMS: " + mensaje);
        // Aquí iría la lógica real para enviar un SMS
    }
}
