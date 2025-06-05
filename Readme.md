# 🌍 Nivell 2 - Abstract Factory Pattern

Welcome to **Level 2** of our design pattern series! This project showcases the **Abstract Factory Design Pattern** to build a small international address and phone number manager.

## 🎯 Objective

Create an **agenda application** that:

- 📬 Allows adding **international addresses**
- ☎️ Supports **international phone numbers**
- 🌐 Considers the different formats of each country

All components—agenda, addresses, and phone numbers—are created using the **Abstract Factory pattern** to handle multiple country formats cleanly and flexibly.

---


## 🏗️ Project Structure


![Captura de pantalla 2025-06-05 a las 12.43.45.png](..%2F..%2F..%2F..%2F..%2F..%2Fvar%2Ffolders%2Fw1%2Flsgtn8350wz3jzzs18jrt9vr0000gn%2FT%2FTemporaryItems%2FNSIRD_screencaptureui_HEAiRB%2FCaptura%20de%20pantalla%202025-06-05%20a%20las%2012.43.45.png)
---

## 🔧 Technologies

- ☕ Java
- 🧱 Object-Oriented Design
- 🧩 Abstract Factory Pattern

---

## 💡 Example Usage

```bash
> Select region: US
> Enter address: 123 Main St, New York, NY
> Enter phone: +1-202-555-0198

> Select region: EU
> Enter address: Unter den Linden 5, 10117 Berlin
> Enter phone: +49-30-123456

> Show contacts
📍 US Contact:
  Address: 123 Main St, New York, NY
  Phone: +1-202-555-0198

📍 EU Contact:
  Address: Unter den Linden 5, 10117 Berlin
  Phone: +49-30-123456
```

🧩 Design Pattern: Abstract Factory

This pattern allows the creation of related objects without specifying their concrete classes. In our case:

    ContactFactory creates Address and PhoneNumber for a specific region.

    Each region has its own concrete factory (e.g., USContactFactory, EUContactFactory) that returns region-specific formats.

This ensures scalability and clean separation of regional formats.
---

📦 How to Run

    Clone the repo:

git clone https://github.com/asantamar87/S03T01N02_abstractFactory_pattern.git

    Compile and run:

cd nivell2-abstract-factory
javac Main.java factories/*.java models/*.java Agenda.java
java Main


🤝 Contributing

Feel free to fork the repository and submit a pull request with enhancements or new regional formats.
📄 License

This project is licensed under the MIT License.
✍️ Author

Crafted with care by Your Name 💼

