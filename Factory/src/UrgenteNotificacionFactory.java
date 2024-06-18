public class UrgenteNotificacionFactory  implements  NotiFactory{
    @Override
    public Notificacion crearEmailNotificacion() {
        return new EmailNotificacion(); // Ejemplo de notificación regular como email
    }

    @Override
    public Notificacion crearSMSNotificacion() {
        return new SMSNotificacion(); // Ejemplo de notificación regular como SMS

    }
}
