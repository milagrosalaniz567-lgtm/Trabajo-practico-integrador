document.getElementById("formulario").addEventListener("submit", function(e) {
  e.preventDefault();

  const nombre = e.target.nombre.value.trim();
  const email = e.target.email.value.trim();
  const telefono = e.target.telefono.value.trim();
  const mensaje = e.target.mensaje.value.trim();

  const errores = [];

  // Validación del nombre
  if (nombre === "" || nombre.length > 30) {
    errores.push("El nombre es inválido. Debe tener entre 1 y 30 caracteres.");
  }

  // Validación del email con expresión regular
  const emailRegex = /^[^@]+@[^@]+\.[a-zA-Z]{2,6}$/;
  if (!emailRegex.test(email)) {
    errores.push("El email es inválido. Debe tener el formato correcto (ejemplo@dominio.com).");
  }

  // Validación del teléfono con expresión regular (10 dígitos)
  const telRegex = /^[0-9]{10}$/;
  if (!telRegex.test(telefono)) {
    errores.push("El teléfono es inválido. Debe contener exactamente 10 dígitos.");
  }

  // Validación del mensaje
  if (mensaje === "" || mensaje.length > 300) {
    errores.push("El mensaje es inválido. Debe tener entre 1 y 300 caracteres.");
  }

  const resultado = document.getElementById("resultado");
  
  // Limpiar contenido previo
  resultado.innerHTML = "";
  resultado.className = "";

  if (errores.length > 0) {
    // Mostrar errores usando createElement
    resultado.className = "show error";
    errores.forEach(err => {
      const p = document.createElement("p");
      p.className = "error-msg";
      p.textContent = "❌ " + err;
      resultado.appendChild(p);
    });
  } else {
    // Mostrar datos enviados usando createElement
    resultado.className = "show success";
    
    const titulo = document.createElement("h3");
    titulo.textContent = "✅ Mensaje enviado exitosamente";
    resultado.appendChild(titulo);

    const pNombre = document.createElement("p");
    const strongNombre = document.createElement("strong");
    strongNombre.textContent = "Nombre: ";
    pNombre.appendChild(strongNombre);
    pNombre.appendChild(document.createTextNode(nombre));
    resultado.appendChild(pNombre);

    const pEmail = document.createElement("p");
    const strongEmail = document.createElement("strong");
    strongEmail.textContent = "Email: ";
    pEmail.appendChild(strongEmail);
    pEmail.appendChild(document.createTextNode(email));
    resultado.appendChild(pEmail);

    const pTelefono = document.createElement("p");
    const strongTelefono = document.createElement("strong");
    strongTelefono.textContent = "Teléfono: ";
    pTelefono.appendChild(strongTelefono);
    pTelefono.appendChild(document.createTextNode(telefono));
    resultado.appendChild(pTelefono);

    const pMensaje = document.createElement("p");
    const strongMensaje = document.createElement("strong");
    strongMensaje.textContent = "Mensaje: ";
    pMensaje.appendChild(strongMensaje);
    pMensaje.appendChild(document.createTextNode(mensaje));
    resultado.appendChild(pMensaje);

    // Resetear el formulario
    e.target.reset();
  }

  // Hacer scroll hasta el resultado
  resultado.scrollIntoView({ behavior: 'smooth', block: 'nearest' });
});