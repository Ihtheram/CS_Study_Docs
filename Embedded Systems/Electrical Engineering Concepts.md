# Electrical Engineering Concepts

- **Current (I)**: The flow of electric charge in a circuit, measured in amperes (A). Ensuring that components receive the correct amount of power is crucial to prevent overheating or failing.
- **Voltage (V)**: The electrical potential difference between two points in a circuit, measured in volts (V). Voltage determines how much energy is available to push current through a circuit. Knowing the voltage ratings of components helps prevent damage.
- **Power (P)**: The rate at which electrical energy is consumed or produced, measured in watts (W). It can be calculated using the formula: P = V × I. Managing power is essential for ensuring that your embedded system operates efficiently and within the limits of its components.

- Ohm's Law: V = I × R (where R is resistance in ohms). This fundamental law relates voltage, current, and resistance, helps analyze and design circuits effectively.

## Basic Circuit Components:

### Resistor
- **Function**: Resistors limit the flow of electric current in a circuit.
- **Key Points**:
  - Measured in ohms (Ω).
  - Used to control voltage and current levels.
  - Can be fixed (constant value) or variable (like potentiometers).
  - Follow Ohm's Law: \( V = I × R \).

### Capacitor
- **Function**: Capacitors store and release electrical energy in a circuit.
- **Key Points**:
  - Measured in farads (F), but commonly used in microfarads (µF) or picofarads (pF).
  - Used for filtering, smoothing voltage fluctuations, and timing applications.
  - Can be polarized (like electrolytic capacitors) or non-polarized (like ceramic capacitors).
  - The voltage across a capacitor cannot change instantaneously.

### Inductor
- **Function**: Inductors store energy in a magnetic field when current flows through them.
- **Key Points**:
  - Measured in henries (H).
  - Used in filtering applications, energy storage, and in transformers.
  - Opposes changes in current, which can lead to voltage spikes when the current is suddenly interrupted.
  - Often found in power supply circuits and RF (Radio Frequency) applications (e.g. cell phones, Wi-Fi routers, and radar).