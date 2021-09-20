## <p align = "right"> ![JaktoolLogo][JaktoolLogo]

<!-- README-Markdown-Template-File -->
# README: Android App with Room Database

<!-- TABLE OF CONTENTS -->
## Table of Contents

* [About the Project](#about-the-project)
* [Getting Started](#getting-started)
  * [Prerequisites](#prerequisites)
  * [Installation](#installation)
* [Usage](#usage)
* [Roadmap](#roadmap)
* [Contributing](#contributing)
* [Contact](#contact)
* [Acknowledgements and Resources](#acknowledgements-and-resources)
________________________
<!-- ABOUT THE PROJECT -->
## About The Project

This is a tutorial from [Stevdza-San ROOM database](https://www.youtube.com/watch?v=lwAvI3WDXBY)

________________________
<!-- GETTING STARTED -->
## Getting Started



### Prerequisites

* Android Studio


### Installation

1. Clone the repo
   ```sh
   git clone https://github.com/github_username/repo_name.git
   ``` 
2. Install Stuff 
3. Setup the Environment
4. Any links you need to make
________________________
<!-- USAGE EXAMPLES -->
## Usage

Use this space to show useful examples of how a project can/should be used.
________________________
<!-- ROADMAP -->
## Roadmap

See the [open issues](https://www.zoho.com) for a list of proposed features (and known issues).
________________________
<!-- CONTRIBUTING -->
## Contributing

Please follow these steps to contribute to the Project

Fork the Project
Create your Feature Branch (`git checkout -b feature/AmazingFeature`)  
Commit your Changes (`git commit -m 'Add some AmazingFeature`)  
Push to the Branch (`git push origin feature/AmazingFeature`)  
Open a Pull Request  

________________________
<!-- LICENSE -->
## License
<img src="https://www.jaktool.com/wp-content/themes/jaktool2019/img/logo.svg" align="right" width="150" height="100" >

Copyright &copy;JAKTOOL LLC. - All Rights Reserved  
Unauthorized copying of this file, via any medium is strictly prohibited.  
Proprietary and confidential

<!-- CONTACT -->
## Contact

Vicki Kaiser - vkaiser@jaktool.com

________________________
<!-- ACKNOWLEDGEMENTS -->
## Acknowledgements and Resources
* [Markdown Cheat Sheet](https://www.markdownguide.org/cheat-sheet/)
* [Git Cheat Sheet](https://github.github.com/training-kit/downloads/github-git-cheat-sheet.pdf)
* [Base64 Image Encoder](https://elmah.io/tools/base64-image-encoder/)

_______________________
## Steps
1. New Empty Android Project
2. build.gradle (Module: xxx.app)  
Note: These versions come from [Google's Maven Repository](https://maven.google.com/) and may need to be updated - the compiler should suggest the most recent available under 'Problems'  

__Within: dependencies {  }__  
```sh
    // Navigation Component
    implementation 'androidx.navigation:navigation-fragment-ktx:2.3.5'
    implementation 'androidx.navigation:navigation-ui-ktx:2.3.5'

// Room components
    implementation "androidx.room:room-runtime:2.3.0"
    kapt "androidx.room:room-compiler:2.3.0"
    implementation "androidx.room:room-ktx:2.3.0"
    androidTestImplementation "androidx.room:room-testing:2.3.0"

// Lifecycle components
    implementation "androidx.lifecycle:lifecycle-extensions:2.2.0"
    implementation "androidx.lifecycle:lifecycle-common-java8:2.3.1"
    implementation "androidx.lifecycle:lifecycle-viewmodel-ktx:2.3.1"

// Kotlin components
    implementation "org.jetbrains.kotlin:kotlin-stdlib-jdk7:1.5.31"
    api "org.jetbrains.kotlinx:kotlinx-coroutines-core:1.5.2"
    api "org.jetbrains.kotlinx:kotlinx-coroutines-android:1.5.2"
    
```
Notice 'kapt' has an error - right click -> Generate -> 
__Within: compileOptions {  }__  
Make sure:
```ssh
  compileOptions {
        sourceCompatibility JavaVersion.VERSION_1_8
        targetCompatibility JavaVersion.VERSION_1_8
    }
    kotlinOptions {
        jvmTarget = '1.8'
    }
}

```

<!-- Embedded Images -->
