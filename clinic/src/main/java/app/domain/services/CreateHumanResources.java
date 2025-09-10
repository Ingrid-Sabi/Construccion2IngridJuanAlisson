package app.domain.services;

import app.domain.model.Employee;
import app.domain.ports.EmployeePort;

public class CreateHumanResources {

    private EmployeePort employeePort;

    // MÉTODO 1: Crear Empleado
    public void crearEmpleado(Employee employee) throws Exception {
        if (employee == null) {
            throw new Exception("El empleado no puede ser nulo");
        }

        if (employeePort.findByDocument(employee) != null) {
            throw new Exception("Ya existe un empleado registrado con ese documento");
        }

        if (employee.getName() == null || ((String) employee.getName()).isEmpty()) {
            throw new Exception("El nombre del empleado es obligatorio");
        }

        if (employee.getRole() == null) {
            throw new Exception("El rol del empleado es obligatorio");
        }

        if (employee.getEmail() == null || ((String) employee.getEmail()).isEmpty() || !employee.getEmail().contains("@")) {
            throw new Exception("El correo electrónico es obligatorio y debe ser válido");
        }

        if (employee.getPhone() == null || ((String) employee.getPhone()).length() < 7) {
            throw new Exception("El teléfono del empleado debe tener al menos 7 dígitos");
        }

        employeePort.save(employee);
    }

    // MÉTODO 2: Actualizar Empleado
    public void actualizarEmpleado(Employee employee) throws Exception {
        if (employee == null) {
            throw new Exception("El empleado no puede ser nulo");
        }

        Employee existing = (Employee) employeePort.findByDocument(employee);
        if (existing == null) {
            throw new Exception("No existe un empleado con ese documento");
        }

        existing.setName(employee.getName());
        existing.setRole(employee.getRole());
        existing.setEmail(employee.getEmail());
        existing.setPhone(employee.getPhone());

        employeePort.update(existing);
    }
}
