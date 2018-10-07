

public class Instruccion
{
    private String etiqueta;
    private String accion;
    private String parameters;



    public Instruccion(String e, String a, String p)
    {
        this.etiqueta = e;
        this.accion = a;
        this.parameters = p;
    }

    public String getEtiqueta()
    {
        return this.etiqueta;
    }

    public void setEtiqueta(String e)
    {
        this.etiqueta = e;
    }

    public String getAccion()
    {
        return this.accion;
    }

    public void setAccion(String a)
    {
        this.accion = a;
    }

    public String getParameters()
    {
        return this.parameters;
    }

    public void setParameters(String p)
    {
        this.parameters = p;
    }
}