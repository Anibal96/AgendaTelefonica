
/**
 * Write a description of class TestAgendaTelefonica here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class TestAgendaTelefonica
{
    /**
     * Constructor for objects of class TestAgendaTelefonica
     */
    public TestAgendaTelefonica()
    {
        int numeroTestsFallados = 0;
        AgendaTelefonica agenda = new AgendaTelefonica();
        numeroTestsFallados += testea(null, agenda.lookupNumber("pepe"), "lookupNumber(String name)");
        agenda.enterNumber("pepe", "987584869");
        numeroTestsFallados += testea("987584869", agenda.lookupNumber("pepe"),
                                      "enterNumber(String name, String number)");
        agenda.enterNumber("juan", "987489635");
        numeroTestsFallados += testea("987489635", agenda.lookupNumber("juan"),
                                      "lookupNumber(String name)");
        numeroTestsFallados += testea(null, agenda.lookupNumber("juanito"),
                                      "lookupNumber(String name)");
        if (numeroTestsFallados == 0) {
            System.out.println("Todos los test se han pasado correctamente!!");
        }
        else {
            System.out.println("Han fallado " + numeroTestsFallados + " tests!!!");
        }
    }
    
    public int testea(Object valorEsperado, Object valorObtenido, 
                          String nombreFuncion)
    {
        int valorDevuelto = 0;
        if (valorEsperado == valorObtenido) {
            System.out.println("OK: " + nombreFuncion);
        }
        else {
            System.out.println("ERROR!!!!! " + nombreFuncion);
            System.out.println("Valor obtenido: " + valorObtenido + 
                               " / Valor esperado: " + valorEsperado);
            valorDevuelto = 1;
        }
        return valorDevuelto;
    }
}
