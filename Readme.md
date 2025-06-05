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
```
📁 java/
┗ 📁 abstractfactory/
┗ 📁 patterns/
┗ 📁 aldo/
┣ 📁 address/
┃ ┣ 📄 Address.java
┃ ┣ 📄 FrenchAddress.java
┃ ┗ 📄 USAddress.java
┣ 📁 factory/
┃ ┣ 📄 ContactFactory.java
┃ ┣ 📄 FranceContactFactory.java
┃ ┗ 📄 USContactFactory.java
┣ 📁 model/
┃ ┣ 📄 Agenda.java
┃ ┗ 📄 Contact.java
┣ 📁 phone/
┃ ┣ 📄 PhoneNumber.java
┃ ┣ 📄 FrenchPhoneNumber.java
┃ ┗ 📄 USPhoneNumber.java
┗ 📄 Main.java
```

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

