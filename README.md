
# Appium Installation Guide

This guide will help you set up the necessary tools and install Appium on your machine.

## Prerequisites

Before installing Appium, make sure you have the following tools set up:

### 1. **Java**

Appium requires Java to run. To check if Java is installed, run:

```bash
$ java --version
```

If Java is not installed, you'll need to install it. After installation, confirm the `JAVA_HOME` path:

```bash
$ echo $JAVA_HOME
```

### 2. **Android Studio & Virtual Device**

Android Studio is essential for creating and running Android apps. It's also used for creating virtual devices for testing.

- **Download and install Android Studio**:  
  [Download Android Studio](https://developer.android.com/studio)

- **Set up a virtual device**:
  - Open Android Studio, go to `Tools` → `AVD Manager` → `Create Virtual Device`.
  - Select a device and complete the setup.

### 3. **Node.js & npm**

Node.js is required to run Appium, and npm is used to install Appium packages.

- **Install Node.js**:  
  [Download Node.js](https://nodejs.org/)
  
- Install Node.js and npm:

```bash
$ sudo apt-get install nodejs
$ sudo apt-get install npm
```

---

## Appium Installation

With the prerequisites installed, you're ready to install Appium.

1. **Install Appium using npm**:

```bash
$ sudo npm install -g appium
```

2. After installation, you can check if Appium was successfully installed by running:

```bash
$ appium --version
```

---

## You're ready to go!

With everything set up, you're now ready to start using Appium for your mobile testing projects. Happy testing! 🎉
