# Interview Questions for AI Enabled Engineering

This is a new competency for us and with the curriculum being somewhat vague in what's required, most questions will fall into the "WHAT" category (i.e. "What is AI?", "What is Weak vs Strong AI", etc). Be prepared for the following questions, note that the list isn't exhaustive and you may be asked follow up questions depending on your answers, some of which may not appear on this list.

## Questions

### What is Artificial Intelligence?
Artificial Intelligence (AI) is a branch of computer science that aims to create intelligent machines that can perform tasks that typically require human intelligence. These tasks include learning, reasoning, problem-solving, perception, and language understanding.
  - #### What is Weak vs Strong AI?
    Weak AI, also known as narrow AI, is designed to perform a specific task or a limited range of tasks. It is focused on a narrow domain and does not possess general intelligence or consciousness. Examples of weak AI include virtual assistants like Siri and Alexa.
    Strong AI, also known as artificial general intelligence (AGI), is the hypothetical ability of a machine to perform any intellectual task that a human can do. It would possess general intelligence and consciousness, allowing it to learn and adapt to new situations, solve complex problems, and exhibit human-like cognitive abilities.
  - #### What is GenAI?
    GenAI is a term used to describe AI systems that are capable of generating new content, such as text, images, or music, based on a given prompt or input. These systems use generative models, such as GPT-3, to create original content that mimics human creativity.
  - #### How does GenAI differ from regular AI?
    GenAI differs from regular AI in that it is specifically designed to generate new content rather than perform predefined tasks or solve specific problems. Regular AI systems are typically focused on tasks like classification, prediction, or optimization, while GenAI systems are focused on creativity and content generation.

### What is Machine Learning?
Machine Learning is a subset of artificial intelligence that focuses on developing algorithms and models that can learn from data and make predictions or decisions without being explicitly programmed. It involves training a model on a dataset to identify patterns and relationships in the data, which can then be used to make predictions on new, unseen data.
  - #### What are the steps involved in Machine Learning?
    The steps involved in Machine Learning typically include:
     1. Data Collection: Gathering and preparing a dataset for training the model.
     2. Data Preprocessing: Cleaning, transforming, and preparing the data for training.
     3. Model Selection: Choosing an appropriate machine learning algorithm or model for the task.
     4. Model Training: Training the selected model on the dataset to learn patterns and relationships.
     5. Model Evaluation: Assessing the performance of the trained model on a separate test dataset.
     6. Model Deployment: Deploying the trained model to make predictions on new data.
  - #### What types of Machine Learning are there?
    There are three main types of Machine Learning:
     1. Supervised Learning: In supervised learning, the model is trained on labeled data, where the input features are paired with the corresponding target labels. The model learns to map input features to output labels based on the training data.
     2. Unsupervised Learning: In unsupervised learning, the model is trained on unlabeled data, where the input features do not have corresponding target labels. The model learns to identify patterns and relationships in the data without explicit guidance.
     3. Reinforcement Learning: In reinforcement learning, the model learns through trial and error by interacting with an environment and receiving feedback in the form of rewards or penalties. The model learns to take actions that maximize cumulative rewards over time.
  - #### What are some Machine Learning Algorithms?
    There are many machine learning algorithms, each designed to solve specific types of problems. Some common machine learning algorithms include:
     - Linear Regression: A regression algorithm that models the relationship between input features and a continuous target variable.
     - Logistic Regression: A classification algorithm that models the probability of an input belonging to a particular class.
     - Decision Trees: A tree-based algorithm that partitions the input space into regions based on feature values.
     - Support Vector Machines: A classification algorithm that finds the optimal hyperplane to separate classes in the input space.
     - K-Nearest Neighbors: A lazy learning algorithm that classifies inputs based on the majority class of their k-nearest neighbors.
     - Neural Networks: A deep learning algorithm that models complex relationships between input features and target variables using interconnected layers of neurons.

### What is an LLM?
An LLM, or Large Language Model, is a type of artificial intelligence model that is trained on a large corpus of text data to generate human-like text. LLMs use deep learning techniques, such as transformer architectures, to learn the patterns and structures of natural language and generate coherent and contextually relevant text.

### What is Prompt Engineering?
Prompt engineering is the process of designing and refining prompts or inputs to AI models to elicit specific responses or behaviors. By carefully crafting prompts, engineers can guide AI models to generate desired outputs or avoid undesirable behaviors, such as bias or misinformation.
  - #### What are some prompts that can be given?
    Prompts can vary depending on the task or objective of the AI model. Some examples of prompts include:
     - Text Generation: Providing a starting sentence or phrase to generate a coherent paragraph or story.
     - Image Captioning: Describing an image to generate a caption that accurately describes the content.
     - Translation: Providing a sentence in one language to generate a translation in another language.
     - Question Answering: Asking a question to generate a relevant answer based on a knowledge base or text corpus.
  - #### Why should we try to prompt engineer?
    Prompt engineering is important to ensure that AI models produce accurate, relevant, and ethical outputs. By carefully designing prompts, engineers can guide the behavior of AI models and mitigate potential biases, errors, or unintended consequences in the generated content.

### What are hallucinations?
Hallucinations are errors or inaccuracies in the output of AI models, where the generated content does not align with the intended task or context. Hallucinations can occur when AI models generate incorrect or misleading information based on the input data or prompt.
  - #### How can we prevent them?
    To prevent hallucinations, engineers can take several steps, including:
     - Data Cleaning: Ensuring that the training data is clean, relevant, and representative of the task.
     - Prompt Engineering: Designing clear and specific prompts to guide the behavior of the AI model.
     - Model Evaluation: Testing the model on diverse datasets and scenarios to identify and correct hallucinations.
     - Post-Processing: Applying filters or constraints to the generated output to remove hallucinations or errors.

### What is an AI Tool?
An AI tool is a software application that uses artificial intelligence algorithms to perform specific tasks and solve problems. AI tools can be used in a variety of industries, from healthcare and finance to marketing and education, to automate tasks, analyze data, and improve decision-making. AI tools work by using machine learning algorithms to analyze data and make decisions based on patterns and trends in the data. They can be used to automate tasks, analyze data, and make predictions based on patterns and trends, leading to increased efficiency and accuracy.

### What is GitHub Copilot?
GitHub Copilot is an AI-powered code completion tool developed by GitHub and OpenAI. It is designed to assist developers in writing code by providing intelligent suggestions and autocompletions. Using advanced machine learning models, GitHub Copilot analyzes the context of your code and generates relevant suggestions for completing code snippets, functions, and even entire classes. It can save developers time and effort by automatically generating code that aligns with the desired functionality. GitHub Copilot supports a wide range of programming languages and frameworks, making it a versatile tool for developers across different domains. It can be integrated into popular code editors, such as Visual Studio Code, enabling a seamless coding experience. By leveraging the power of AI, GitHub Copilot aims to enhance developer productivity and reduce the cognitive load associated with writing code. It can be a valuable tool for both experienced developers looking to speed up their workflow and beginners seeking guidance and learning opportunities. To use GitHub Copilot, you can install the GitHub Copilot extension in your preferred code editor and enable it to provide code suggestions as you write.
  - #### How can we use Copilot? What can we generate?
    GitHub Copilot can be used to generate code completions, function bodies, class definitions
  - #### Should we rely solely on Copilot? What's the best way to use it?
    GitHub Copilot can be a helpful tool for generating code snippets and suggestions, but it is important to review and understand the generated code before using it in production. Developers should use Copilot as a productivity tool to speed up coding tasks and provide guidance, rather than relying solely on its suggestions.
  - #### How can we be responsible with our use of AI Tools?
    To be responsible with the use of AI tools like GitHub Copilot, developers should:
     - Review and validate the generated code to ensure accuracy and correctness.
     - Understand the limitations and biases of AI models and adjust the prompts or inputs accordingly.
     - Use AI tools as aids to enhance productivity and creativity, rather than replacing human judgment and expertise.
  - #### What are some security considerations to be aware of when using tools like Github Copilot?
    When using tools like GitHub Copilot, developers should be aware of potential security risks, such as:
     - Data Privacy: Ensure that sensitive or confidential information is not shared in code snippets or prompts.
     - Code Vulnerabilities: Review the generated code for security vulnerabilities, such as injection attacks or buffer overflows.
     - Intellectual Property: Be mindful of copyright and licensing issues when using code snippets generated by Copilot.
     - Model Bias: Be aware of biases in the AI model that may influence the generated code and take steps to mitigate bias in the output.
