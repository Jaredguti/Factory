//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        NotificacionFactory factory = new NotificacionFactory();
        Notificacion emailNotificacion = factory.crearNotificacion("email");
        emailNotificacion.enviarMensaje("Este es un mensaje por email");

        // Uso del patrón Abstract Factory - Ejemplo de notificaciones urgentes
        NotiFactory urgenteFactory = new UrgenteNotificacionFactory();
        Notificacion emailUrgente = urgenteFactory.crearEmailNotificacion();
        emailUrgente.enviarMensaje("Este es un mensaje urgente por email");

        Notificacion smsUrgente = urgenteFactory.crearSMSNotificacion();
        smsUrgente.enviarMensaje("Este es un mensaje urgente por SMS");

        // Uso del patrón Abstract Factory - Ejemplo de notificaciones regulares
        NotiFactory regularFactory = new RegularNotificacionFactory();
        Notificacion emailRegular = regularFactory.crearEmailNotificacion();
        emailRegular.enviarMensaje("Este es un mensaje regular por email");

        Notificacion smsRegular = regularFactory.crearSMSNotificacion();
        smsRegular.enviarMensaje("Este es un mensaje regular por SMS");
    }
}