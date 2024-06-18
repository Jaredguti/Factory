public class EmailNotificacion implements Notificacion{
    @Override
    public void enviarMensaje(String mensaje) {
        System.out.println("Enviando email: " + mensaje);
        // Aquí iría la lógica real para enviar un email
    }
}
