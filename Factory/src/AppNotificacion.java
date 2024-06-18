public class AppNotificacion implements  Notificacion{
    @Override
    public void enviarMensaje(String mensaje) {
        System.out.println("Enviando mensaje de aplicación: " + mensaje);
        // Aquí iría la lógica real para enviar un mensaje de aplicación
    }
}
