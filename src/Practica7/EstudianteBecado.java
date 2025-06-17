package Practica7;

class EstudianteBecado extends Estudiante {
    private String tipoBeca;

    public EstudianteBecado(String nombre, int edad, String carrera, double promedio, String tipoBeca) {
        super(nombre, edad, carrera, promedio);
        this.tipoBeca = tipoBeca;
    }

    public void aplicarDescuento() {
        double descuento = 0;
        if ("Académica".equalsIgnoreCase(tipoBeca) && super.promedio >= 9) {
            descuento = 50;
        } else if ("Económica".equalsIgnoreCase(tipoBeca)) {
            descuento = 40;
        } else {
            descuento = 30;
        }
        System.out.println("Descuento del " + descuento + "%");
    }

    @Override
    public void mostrarDatos() {
        super.mostrarDatos();
        System.out.println("Tipo de beca: " + tipoBeca);
    }
}

