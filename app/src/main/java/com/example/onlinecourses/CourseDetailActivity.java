package com.example.onlinecourses;
import android.annotation.SuppressLint;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import java.util.Objects;

public class CourseDetailActivity extends AppCompatActivity {

    @SuppressLint("SetTextI18n")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_course_detail);

        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        if (getSupportActionBar() != null) {
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
            getSupportActionBar().setTitle("Course Details");
        }

        // Back button functionality
        toolbar.setNavigationOnClickListener(v -> onBackPressed());

        // Get selected course name
        String courseName = getIntent().getStringExtra("courseName");

        // Initialize views
        TextView tvCourseTitle = findViewById(R.id.tvCourseTitle);
        TextView tvCourseOverview = findViewById(R.id.tvCourseOverview);
        TextView tvJobRoles = findViewById(R.id.tvJobRoles);
        tvCourseTitle.setText(courseName);
        TextView tvCourseHeading = findViewById(R.id.tvCourseHeading);
        tvCourseHeading.setText("What is " + courseName + "?");
        ImageView ivCourseImage = findViewById(R.id.ivCourseImage);
        LinearLayout linksContainer = findViewById(R.id.linksContainer);

        // Set course title



        // Set content based on course
        switch (Objects.requireNonNull(courseName)) {
            case "Web Development":
                ivCourseImage.setImageResource(R.drawable.web);
                tvCourseOverview.setText("Web development is the process of creating websites and web applications that are accessible via the internet. It involves both frontend and backend development, where frontend development focuses on the design and functionality of what users see and interact with, using technologies like HTML, CSS, and JavaScript. Backend development, on the other hand, deals with the server-side, where data is processed and stored using programming languages like Python, PHP, or Node.js, and databases like MySQL or MongoDB. Full-stack developers are skilled in both areas, allowing them to build complete applications. Web development also includes ensuring user experience (UX) design, web security, and deployment, ensuring the website functions smoothly, securely, and is accessible to users. Over time, the field has evolved with new frameworks, tools, and best practices, enabling developers to create faster, more interactive, and visually appealing websites and applications.");
                tvJobRoles.setText("Job Roles:\n- Front-end Developer\n- Back-end Developer\n- Full Stack Developer\n- UI/UX Designer");
                addLink(linksContainer, "FreeCodeCamp Web Development", "https://www.freecodecamp.org/");
                addLink(linksContainer, "Web Development by Codecademy", "https://www.codecademy.com/catalog/subject/web-development");
                addLink(linksContainer, "Coursera Web Development", "https://www.coursera.org/browse/computer-science/web-development");
                break;

            case "Java Programming":
                ivCourseImage.setImageResource(R.drawable.java);
                tvCourseOverview.setText("Java is a high-level, object-oriented programming language designed to be platform-independent, meaning it can run on any device or operating system with a Java Virtual Machine (JVM). Developed by Sun Microsystems (now part of Oracle Corporation) in 1995, Java is widely used for building web, mobile, and enterprise applications. It is known for its simplicity, portability, and robustness. Java follows the principle of \"write once, run anywhere\" (WORA), allowing developers to create code that can run seamlessly on different platforms. Its syntax is similar to C++ but with simpler object-oriented features. Java's extensive standard library supports tasks such as networking, database connectivity, and graphical user interface development. Popular frameworks like Spring and Hibernate further enhance its versatility, making it a staple choice for large-scale enterprise software, Android development, and server-side applications.");
                tvJobRoles.setText("Job Roles:\n- Java Developer\n- Backend Engineer\n- Android Developer\n- Software Architect");
                addLink(linksContainer, "Learn Java on Codecademy", "https://www.codecademy.com/learn/learn-java");
                addLink(linksContainer, "Java Programming on Coursera", "https://www.coursera.org/specializations/java-programming");
                addLink(linksContainer, "FreeCodeCamp Java Guide", "https://www.freecodecamp.org/news/java-tutorial/");
                break;

            case "Python Programming":
                ivCourseImage.setImageResource(R.drawable.python);
                tvCourseOverview.setText("Python is a high-level, interpreted programming language known for its simplicity, readability, and versatility. Created by Guido van Rossum in 1991, Python emphasizes code readability through its clean syntax and uses indentation to define code blocks, which reduces complexity. It supports multiple programming paradigms, including procedural, object-oriented, and functional programming, making it adaptable for various tasks. \n" +
                        "\n" +
                        "Python is widely used in fields like web development, data analysis, artificial intelligence, scientific computing, automation, and more. Its extensive standard library and third-party packages, accessible via tools like `pip`, enable developers to tackle a vast array of problems efficiently. Frameworks like Django and Flask simplify web development, while libraries like NumPy, pandas, TensorFlow, and PyTorch empower data scientists and machine learning practitioners. Python’s beginner-friendly nature, combined with its power and flexibility, has made it one of the most popular programming languages in the world.");
                tvJobRoles.setText("Job Roles:\n- Python Developer\n- Data Scientist\n- Machine Learning Engineer\n- Backend Developer");
                addLink(linksContainer, "Learn Python on Codecademy", "https://www.codecademy.com/learn/learn-python-3");
                addLink(linksContainer, "Python for Everybody on Coursera", "https://www.coursera.org/specializations/python");
                addLink(linksContainer, "Real Python Tutorials", "https://realpython.com/");
                break;

            case "Android Development":
                ivCourseImage.setImageResource(R.drawable.android);
                tvCourseOverview.setText("Android development refers to the process of creating applications for devices running the Android operating system, developed by Google. Android is an open-source, Linux-based platform that powers a vast majority of smartphones, tablets, TVs, and wearable devices globally. Android applications are primarily written in Java, Kotlin, or C++, with Kotlin now being the preferred language due to its modern features and enhanced productivity.\n" +
                        "\n" +
                        "Developers use Android Studio, the official Integrated Development Environment (IDE) for Android, to design, code, and test applications. The Android Software Development Kit (SDK) provides tools, libraries, and APIs for creating user interfaces, managing hardware, and accessing platform-specific features. Applications are built using components like Activities, Fragments, and Services, and are packaged into APK (Android Package) files for distribution via app stores like Google Play.\n" +
                        "\n" +
                        "Android development is highly versatile, supporting features like touchscreen interaction, GPS navigation, camera access, and integration with other apps. With a vast user base and continuous updates from Google, Android development remains a thriving field for creating innovative and engaging applications across various industries.");
                tvJobRoles.setText("Job Roles:\n- Android Developer\n- Mobile App Developer\n- Backend Engineer for Mobile Apps\n- Software Engineer");
                addLink(linksContainer, "Android Development by Google", "https://developer.android.com/courses");
                addLink(linksContainer, "FreeCodeCamp Android Guide", "https://www.freecodecamp.org/news/learn-android-development/");
                addLink(linksContainer, "Udacity Android Basics", "https://www.udacity.com/course/android-basics-nanodegree-by-google--nd803");
                break;

            case "DevOps":
                ivCourseImage.setImageResource(R.drawable.devops);
                tvCourseOverview.setText("DevOps is a set of practices, principles, and tools that aim to bridge the gap between software development (Dev) and IT operations (Ops) to streamline the software development lifecycle. It emphasizes collaboration, automation, and continuous integration/continuous delivery (CI/CD) to enhance the speed, quality, and reliability of software delivery. The core idea is to foster a culture where development and operations teams work together seamlessly, breaking down traditional silos.\n" +
                        "\n" +
                        "DevOps practices include automating repetitive tasks such as testing, deployment, and monitoring, enabling faster and more frequent releases. Tools like Jenkins, Git, Docker, Kubernetes, and Ansible are widely used to implement these practices, along with cloud platforms like AWS, Azure, and Google Cloud for scalability. Key components of DevOps include version control, automated testing, infrastructure as code (IaC), continuous monitoring, and feedback loops.\n" +
                        "\n" +
                        "By adopting DevOps, organizations can improve efficiency, reduce errors, and respond quickly to changes in customer needs or market demands. It plays a crucial role in modern software development by aligning technology with business objectives and fostering innovation through rapid and reliable delivery pipelines.");
                tvJobRoles.setText("Job Roles:\n- DevOps Engineer\n- Site Reliability Engineer\n- Cloud Engineer\n- System Administrator");
                addLink(linksContainer, "DevOps on Udemy", "https://www.udemy.com/course/devops-training/");
                addLink(linksContainer, "Coursera DevOps Specialization", "https://www.coursera.org/specializations/devops");
                addLink(linksContainer, "AWS DevOps Learning Path", "https://aws.amazon.com/devops/learning-path/");
                break;

            case "Cloud Computing":
                ivCourseImage.setImageResource(R.drawable.cloud);
                tvCourseOverview.setText("Cloud computing is a technology that delivers computing services—such as storage, processing power, databases, networking, software, and analytics—over the internet, often referred to as \"the cloud.\" Instead of owning and managing physical servers or data centers, organizations and individuals can access these resources on-demand from cloud service providers like Amazon Web Services (AWS), Microsoft Azure, and Google Cloud.\n" +
                        "\n" +
                        "Cloud computing operates on a pay-as-you-go model, allowing users to scale resources up or down based on their needs, making it cost-effective and flexible. It is categorized into three main service models:\n" +
                        "\n" +
                        "1. **Infrastructure as a Service (IaaS):** Provides virtualized computing resources like virtual machines and storage.\n" +
                        "2. **Platform as a Service (PaaS):** Offers a platform for developers to build and deploy applications without worrying about the underlying infrastructure.\n" +
                        "3. **Software as a Service (SaaS):** Delivers fully managed software applications accessible via a web browser, such as email or customer relationship management (CRM) tools.\n" +
                        "\n" +
                        "Cloud computing offers benefits such as reduced IT costs, increased scalability, global accessibility, and enhanced collaboration. It supports various use cases, including data storage, big data analytics, machine learning, app development, and disaster recovery. Its ability to enable remote work and innovation has made it a cornerstone of modern IT infrastructure.");
                tvJobRoles.setText("Job Roles:\n- Cloud Engineer\n- Cloud Architect\n- Solutions Architect\n- Cloud Security Specialist");
                addLink(linksContainer, "AWS Free Tier Training", "https://aws.amazon.com/training/");
                addLink(linksContainer, "Google Cloud Training", "https://cloud.google.com/training");
                addLink(linksContainer, "Coursera Cloud Computing Specialization", "https://www.coursera.org/specializations/cloud-computing");
                break;

            case "C Programming":
                ivCourseImage.setImageResource(R.drawable.c);
                tvCourseOverview.setText("C is a high-level, general-purpose programming language developed by Dennis Ritchie in the early 1970s at Bell Labs. It is one of the most widely used and influential programming languages, serving as the foundation for many modern languages like C++, Java, and Python. Known for its efficiency and close-to-hardware capabilities, C is commonly used for system-level programming, including operating systems, embedded systems, and performance-critical applications.\n" +
                        "\n" +
                        "C follows a procedural programming paradigm, which emphasizes functions and sequential execution of instructions. It provides low-level access to memory through pointers, supports bitwise operations, and allows direct manipulation of hardware, making it highly suitable for tasks requiring fine-grained control. Its simple syntax and powerful constructs, like loops, conditionals, and arrays, make it versatile for a wide range of applications.\n" +
                        "\n" +
                        "Despite its simplicity, C requires careful memory management, as it does not have automatic garbage collection. It is highly portable, as programs written in C can be compiled and executed on various platforms with minimal modifications. C’s enduring popularity stems from its speed, reliability, and role as a foundational language in computer science and software development.");
                tvJobRoles.setText("Job Roles:\n- Embedded Systems Developer\n- System Programmer\n- Firmware Engineer\n- Game Developer");
                addLink(linksContainer, "Learn C on TutorialsPoint", "https://www.tutorialspoint.com/cprogramming/index.htm");
                addLink(linksContainer, "GeeksforGeeks C Language", "https://www.geeksforgeeks.org/c-programming-language/");
                addLink(linksContainer, "Learn C Programming by Programiz", "https://www.programiz.com/c-programming");
                break;

            case "C++ Programming":
                ivCourseImage.setImageResource(R.drawable.cpp);
                tvCourseOverview.setText("C++ is a high-level, general-purpose programming language that builds on the foundation of C by adding object-oriented programming (OOP) features. Developed by Bjarne Stroustrup in the early 1980s, C++ is designed to provide both low-level memory manipulation capabilities and high-level abstractions for complex software development. It is widely used in system programming, game development, embedded systems, and performance-critical applications.\n" +
                        "\n" +
                        "C++ supports multiple programming paradigms, including procedural, object-oriented, and generic programming, offering flexibility to developers. Its features include classes, inheritance, polymorphism, and templates, enabling code reuse and modularity. C++ also provides extensive support for the Standard Template Library (STL), which includes ready-to-use data structures and algorithms.\n" +
                        "\n" +
                        "While it inherits C's performance and efficiency, C++ introduces better error handling and type safety. It offers finer control over system resources but requires careful memory management, as improper use can lead to issues like memory leaks. The language is widely adopted for developing operating systems, high-performance applications, and games due to its balance of power, control, and scalability.");
                tvJobRoles.setText("Job Roles:\n- C++ Developer\n- Game Developer\n- Software Engineer\n- System Architect");
                addLink(linksContainer, "Learn C++ on GeeksforGeeks", "https://www.geeksforgeeks.org/c-plus-plus/");
                addLink(linksContainer, "C++ Programming on Codecademy", "https://www.codecademy.com/learn/learn-c-plus-plus");
                addLink(linksContainer, "TutorialsPoint C++", "https://www.tutorialspoint.com/cplusplus/index.htm");
                break;

            case "AI & ML":
                ivCourseImage.setImageResource(R.drawable.ai);
                tvCourseOverview.setText("AIML (Artificial Intelligence Markup Language) is an XML-based language used to create conversational agents or chatbots. Developed by Richard Wallace in 1995 for the A.L.I.C.E. (Artificial Linguistic Internet Computer Entity) project, AIML focuses on pattern matching and rule-based responses to simulate human-like conversations. It uses simple XML tags like `<pattern>` for user inputs and `<template>` for bot responses, enabling developers to define how chatbots interact. AIML is widely used for building straightforward conversational systems in customer support, education, and entertainment. While it is simple and effective for rule-based tasks, AIML lacks the learning and adaptability of modern AI systems powered by machine learning.");
                tvJobRoles.setText("Job Roles:\n- AI Engineer\n- Machine Learning Engineer\n- Data Scientist\n- Research Scientist");
                addLink(linksContainer, "Machine Learning on Coursera", "https://www.coursera.org/learn/machine-learning");
                addLink(linksContainer, "AI for Everyone on Coursera", "https://www.coursera.org/learn/ai-for-everyone");
                addLink(linksContainer, "Google AI Resources", "https://ai.google/education/");
                break;

            case "Cyber Security":
                ivCourseImage.setImageResource(R.drawable.cyber);
                tvCourseOverview.setText("Cybersecurity refers to the practice of protecting computer systems, networks, and data from unauthorized access, theft, damage, or disruption. It encompasses a wide range of technologies, processes, and practices designed to safeguard digital assets and ensure the confidentiality, integrity, and availability of information. With the increasing reliance on digital technologies, cybersecurity has become critical for individuals, businesses, and governments to defend against threats like hacking, malware, ransomware, phishing, and denial-of-service (DoS) attacks.\n" +
                        "\n" +
                        "Key aspects of cybersecurity include network security, endpoint protection, data encryption, identity and access management, and regular security audits. Advanced measures like threat detection, incident response, and penetration testing help organizations stay resilient against evolving cyber threats. Cybersecurity also involves compliance with regulations and standards such as GDPR, HIPAA, and ISO 27001. \n" +
                        "\n" +
                        "As cyber threats grow in sophistication, cybersecurity has become a dynamic field, integrating innovations like artificial intelligence, machine learning, and blockchain to enhance defense mechanisms. It plays a vital role in protecting sensitive data, maintaining trust, and ensuring the uninterrupted operation of critical infrastructure and digital ecosystems.");
                tvJobRoles.setText("Job Roles:\n- Cyber Security Analyst\n- Security Consultant\n- Penetration Tester\n- Forensic Analyst");
                addLink(linksContainer, "Introduction to Cyber Security by Cybrary", "https://www.cybrary.it/course/introduction-to-it-and-cybersecurity/");
                addLink(linksContainer, "Cyber Security on Coursera", "https://www.coursera.org/specializations/cyber-security");
                addLink(linksContainer, "Khan Academy Cyber Security", "https://www.khanacademy.org/computing/computer-science/cryptography");
                break;

            case "Marketing":
                ivCourseImage.setImageResource(R.drawable.marketing);
                tvCourseOverview.setText("Digital marketing refers to the use of digital channels, platforms, and technologies to promote products, services, or brands to a target audience. It leverages the internet and electronic devices such as computers, smartphones, and tablets to engage potential customers. Digital marketing includes various strategies such as search engine optimization (SEO), content marketing, social media marketing, email marketing, pay-per-click (PPC) advertising, influencer marketing, and affiliate marketing.\n" +
                        "\n" +
                        "One of the key advantages of digital marketing is its ability to reach a global audience and target specific demographics based on factors like age, location, interests, and online behavior. With tools like Google Analytics and social media insights, digital marketing also allows businesses to measure campaign performance in real-time and make data-driven decisions.\n" +
                        "\n" +
                        "The growing use of mobile devices, social media platforms, and online shopping has made digital marketing a vital component of modern business strategies. It provides businesses with cost-effective ways to reach and engage their customers, build brand awareness, and drive sales in an increasingly connected world.");
                tvJobRoles.setText("Job Roles:\n- Digital Marketer\n- Social Media Manager\n- SEO Specialist\n- Content Marketer");
                addLink(linksContainer, "Digital Marketing by Google", "https://learndigital.withgoogle.com/digitalgarage/");
                addLink(linksContainer, "HubSpot Marketing Academy", "https://academy.hubspot.com/courses/marketing");
                addLink(linksContainer, "Coursera Marketing Essentials", "https://www.coursera.org/browse/business/marketing");
                break;

            case "Data Analysis":
                ivCourseImage.setImageResource(R.drawable.data);
                tvCourseOverview.setText("Data analysis is the process of inspecting, cleaning, transforming, and modeling data to uncover useful information, draw conclusions, and support decision-making. It involves using statistical, computational, and analytical techniques to extract patterns, trends, and insights from raw data. Data analysis is essential across various fields, such as business, finance, healthcare, science, and social research, to make informed decisions, solve problems, and optimize processes.\n" +
                        "\n" +
                        "The data analysis process typically includes several stages: data collection, data cleaning (removing inaccuracies or inconsistencies), exploratory data analysis (understanding basic patterns and distributions), and applying statistical models or machine learning algorithms. The insights gained can then be visualized through charts, graphs, or dashboards to make the data easier to understand and communicate to stakeholders.\n" +
                        "\n" +
                        "Tools like Microsoft Excel, Python (with libraries such as pandas, NumPy, and Matplotlib), R, and data visualization tools like Tableau or Power BI are commonly used in data analysis. With the increasing availability of big data and advanced analytics techniques, data analysis plays a critical role in driving business strategy, improving operational efficiency, and gaining competitive advantages.");
                tvJobRoles.setText("Job Roles:\n- Data Analyst\n- Business Analyst\n- Data Scientist\n- Data Engineer");
                addLink(linksContainer, "Data Analysis on Coursera", "https://www.coursera.org/specializations/data-analysis");
                addLink(linksContainer, "Learn Data Analysis on Khan Academy", "https://www.khanacademy.org/math/statistics-probability");
                addLink(linksContainer, "Udemy Data Analysis Courses", "https://www.udemy.com/topic/data-analysis/");
                break;

            default:
                ivCourseImage.setImageResource(R.drawable.place_holder);
                tvCourseOverview.setText("Information about this course is coming soon!");
                tvJobRoles.setText("Job Roles: Not Available");
                break;
        }
    }

    // Helper method to add a clickable link
    private void addLink(LinearLayout container, String linkText, String url) {
        TextView link = new TextView(this);
        link.setText(linkText);
        link.setTextSize(16);
        link.setTextColor(getResources().getColor(R.color.teal_700));
        link.setPadding(0, 8, 0, 8);
        link.setOnClickListener(v -> {
            Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse(url));
            startActivity(browserIntent);
        });
        container.addView(link);
    }
}

