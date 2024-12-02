# Interview Questions for AI Enabled Engineering

### What is Artificial Intelligence?
Artificial Intelligence (AI) is a branch of computer science that aims to create intelligent machines that can simulate human intelligence and perform tasks such as learning, reasoning, problem-solving, perception, and language understanding.
Types of AI:
  - Weak AI (Narrow AI): Designed to perform a specific task or a limited range of tasks.
  - Strong AI (Artificial General Intelligence): Hypothetical ability of a machine to perform any intellectual task that a human can do.
  - GenAI: AI systems capable of generating new content based on a given prompt or input.

  - #### What is the difference between Weak and Strong AI?
    Weak AI, also known as narrow AI, is designed to perform a specific task or a limited range of tasks. It is focused on a narrow domain and does not possess general intelligence or consciousness. Examples of weak AI include virtual assistants like Siri and Alexa, AI in Self-Driving Cars, and AI in recommendation systems such as Netflix, Amazon, Spotify, etc.
    Strong AI, also known as artificial general intelligence (AGI), is the hypothetical ability of a machine to perform any intellectual task that a human can do. It would possess general intelligence and consciousness, allowing it to learn and adapt to new situations, solve complex problems, and exhibit human-like cognitive abilities. Strong AI is still a theoretical concept and has not been achieved yet. Examples of strong AI include sentient robots or AI systems that can pass the Turing Test.
  - #### What is GenAI?
    GenAI is a term used to describe AI systems that are capable of generating new content, such as text, images, or music, based on a given prompt or input. These systems use generative models, such as GPT-3, to create original content that mimics human creativity. Examples of GenAI applications include text generation, image synthesis, and music composition.
  - #### How does GenAI differ from regular AI?
    GenAI differs from regular AI in that it is specifically designed to generate new content rather than perform predefined tasks or solve specific problems. Regular AI systems are typically focused on tasks like classification, prediction, or optimization, while GenAI systems are focused on creativity and content generation.

### What is Machine Learning?
Machine Learning is a subset of artificial intelligence that focuses on developing algorithms and models that can learn from data and make predictions or decisions without being explicitly programmed. It involves training a model on a dataset to identify patterns and relationships in the data, which can then be used to make predictions on new, unseen data. Types of Machine Learning:
  - Supervised Learning (Regression, Classification)
  - Unsupervised Learning (Clustering, Dimensionality Reduction)
  - Reinforcement Learning (Reward-based learning)

  - #### What are the steps involved in Machine Learning?
    The steps involved in Machine Learning typically include:
    1. Decision Process: The algorithm will attempt to predict a value or classify a new example based off previous information
    2. Error Function: A way to measure how wrong the model is. Can vary based off the problem (classification/ predicition). The entire goal is to minimize error since that raises accuracy.
    3. Optimization Process: A way for us to update the model based off the current weights held and the error function. The goal is to update the weights, which control how important specific input features are, and use that new model to hopefully achieve a lower error on the training and test sets. This is an iterative approach and will repeat until a desired threshold for accuracy is acheived

  - #### What types of Machine Learning are there?
    There are three main types of Machine Learning:
    1. Supervised Learning: In supervised learning, the model is trained on labeled data, where the input features are paired with the corresponding target labels. The model learns to map input features to output labels based on the training data. Examples of supervised learning tasks include regression and classification.
    2. Unsupervised Learning: In unsupervised learning, the model is trained on unlabeled data, where the input features do not have corresponding target labels. The model learns to identify patterns and relationships in the data without explicit guidance. Examples of unsupervised learning tasks include clustering and dimensionality reduction.
    3. Semi-supervised Learning: The combination or middle ground between Supervised and Unsupervised. This often starts with using the smaller, labelled dataset to guide initial model setup and then tests that model against the unlabelled dataset to uncover new connections or information about the data. Generally used as a cost-effective alternative if it costs too much to label data. Examples of semi-supervised learning tasks include image recognition and speech recognition.
    4. Reinforcement Learning: In reinforcement learning, the model learns through trial and error by interacting with an environment and receiving feedback in the form of rewards or penalties. The model learns to take actions that maximize cumulative rewards over time. Examples of reinforcement learning tasks include game playing and robotic control.

  - #### What are some Machine Learning Algorithms?
    There are many machine learning algorithms, each designed to solve specific types of problems. Some common machine learning algorithms include:
    - **Linear regression**: *Predicts numerical values*, based on a linear relationship between different values. For example, it can predict house prices based on historical data for the area.
    - **Logistic regression**: Supervised learning algorithm, makes predictions for *categorical response variables*, such as “yes/no” answers to questions. It can be used for applications such as classifying spam and quality control on a production line.
    - **Clustering**: Using unsupervised learning, *identifies patterns in data* so that it can be grouped. Helps identifying differences between data items. Example of clustering application is customer segmentation, fraud detection.
    - **Decision tree**: Used for both *predicting numerical values (regression) and classifying data into categories*, uses a branching sequence of linked decisions which is represented with a tree diagram. Example of a decision tree application is predicting whether a customer will buy a product based on their demographic information.
    - **Random forest**: *Combines the results from a number of decision trees* and predicts a value or category. Examples of Random Forest applications include predicting customer churn and classifying diseases.
    - **Neural network**: Uses a *huge number of linked processing nodes* and simulates the way the human brain works, and is good at recognizing patterns. It plays an important role in applications such as natural language translation, face recognition, speech recognition, and image creation. Example of neural network application is predicting stock prices.
    	- Neural network Uses a series of node called neurons that perform some calculation based off the input features and the interal weights of the node (normally this means we'll have a weight for each input feature and we'll multiply the weight by the feature itself). This will allow the network to make some decision (prediction or a classification) and then the accuracy of this is usually checked against the label of the data and a process call back propagation is used to update the weights and make the model more accurate.

### What is an LLM?
An LLM, or Large Language Model, is a type of artificial intelligence model that is trained on a large corpus of text data to generate human-like text. LLMs use deep learning techniques, such as transformer architectures, to learn the patterns and structures of natural language and generate coherent and contextually relevant text. Examples of LLMs include GPT-3 (Generative Pre-trained Transformer 3) developed by OpenAI, which has been used for a wide range of natural language processing tasks, such as text generation, translation, and question answering.

### What is Prompt Engineering?
Prompt engineering is the process of designing and refining prompts or inputs to AI models to elicit specific responses or behaviors. By carefully crafting prompts, engineers can guide AI models to generate desired outputs or avoid undesirable behaviors, such as bias or misinformation. Examples of prompt engineering include providing context, constraints, or examples to guide the behavior of the AI model.
  - #### What are some prompts that can be given?
    Prompts can vary depending on the task or objective of the AI model. Some examples of prompts include:
     - Text Generation: Providing a starting sentence or phrase to generate a coherent paragraph or story.
     - Image Captioning: Describing an image to generate a caption that accurately describes the content.
     - Translation: Providing a sentence in one language to generate a translation in another language.
     - Question Answering: Asking a question to generate a relevant answer based on a knowledge base or text corpus.
  - #### Why should we try to prompt engineer?
    Prompt engineering is important to ensure that AI models produce accurate, relevant, and ethical outputs. By carefully designing prompts, engineers can guide the behavior of AI models and mitigate potential biases, errors, or unintended consequences in the generated content.

### What are hallucinations?
Hallucinations are errors or inaccuracies in the output of AI models, where the generated content does not align with the intended task or context. Hallucinations can occur when AI models generate incorrect or misleading information based on the input data or prompt. Examples of hallucinations include generating nonsensical text, incorrect predictions, or biased outputs.
  - #### How can we prevent them?
    To prevent hallucinations, engineers can take several steps, including:
     - Data Cleaning: Ensuring that the training data is clean, relevant, and representative of the task.
     - Prompt Engineering: Designing clear and specific prompts to guide the behavior of the AI model.
     - Model Evaluation: Testing the model on diverse datasets and scenarios to identify and correct hallucinations.
     - Post-Processing: Applying filters or constraints to the generated output to remove hallucinations or errors.
     - Retrieval Augmented Generation (RAG): A technique that combines the capabilities of a pre-trained large language model with an external data source. This approach combines the generative power of LLMs like GPT-3 or GPT-4 with the precision of specialized data search mechanisms, resulting in a system that can offer nuanced responses.
     - Chain-of-thought (CoT): Asking the model to explain the steps it took to arrive at the answer, this will allow us to evaluate the micro steps it took to arrive at the completion.

### What is an AI Tool?
An AI tool is a software application that uses artificial intelligence algorithms to perform specific tasks and solve problems. AI tools can be used in a variety of industries, from healthcare and finance to marketing and education, to automate tasks, analyze data, and improve decision-making. AI tools work by using machine learning algorithms to analyze data and make decisions based on patterns and trends in the data. They can be used to automate tasks, analyze data, and make predictions based on patterns and trends, leading to increased efficiency and accuracy. Examples of AI tools include chatbots, recommendation systems, image recognition software, and predictive analytics platforms.

### What is GitHub Copilot?
GitHub Copilot is an AI-powered code completion tool developed by GitHub and OpenAI. It is designed to assist developers in writing code by providing intelligent suggestions and autocompletions. Using advanced machine learning models, GitHub Copilot analyzes the context of your code and generates relevant suggestions for completing code snippets, functions, and even entire classes. It can save developers time and effort by automatically generating code that aligns with the desired functionality. GitHub Copilot supports a wide range of programming languages and frameworks, making it a versatile tool for developers across different domains. It can be integrated into popular code editors, such as Visual Studio Code, enabling a seamless coding experience. By leveraging the power of AI, GitHub Copilot aims to enhance developer productivity and reduce the cognitive load associated with writing code. It can be a valuable tool for both experienced developers looking to speed up their workflow and beginners seeking guidance and learning opportunities. To use GitHub Copilot, you can install the GitHub Copilot extension in your preferred code editor and enable it to provide code suggestions as you write.
  - #### How can we use Copilot? What can we generate?
    GitHub Copilot can be used to generate code completions, function bodies, class definitions
    - Code Completion: GitHub Copilot can automatically suggest code as typed, making it easier to write code quickly and efficiently. As we type code in the editor, GitHub Copilot will automatically suggest completions as typed. Then Pressing Tab will accept a suggestion.
    - Writing New Functions: GitHub Copilot can assist in writing new functions by suggesting the function body based on the function name and comments describing the function.
    - Learning a New Language or Framework: GitHub Copilot can provide code suggestions in many different languages and frameworks and also can provide information on the existing codebase by simply highlighting the code and asking Copilot to explain it.
    - Writing Tests: GitHub Copilot can suggest tests based on an existing code by writing the function or method to be tested then start writing a test function, and GitHub Copilot will suggest a test based on the existing code.
  
  - #### Should we rely solely on Copilot? What's the best way to use it?
    GitHub Copilot can be a helpful tool for generating code snippets and suggestions, but it is important to review and understand the generated code before using it in production. Developers should use Copilot as a productivity tool to speed up coding tasks and provide guidance, rather than relying solely on its suggestions.
  - #### How can we be responsible with our use of AI Tools?
    To be responsible with the use of AI tools like GitHub Copilot, developers should:
     - Review and validate the generated code to ensure accuracy and correctness.
     - Understand the limitations and biases of AI models and adjust the prompts or inputs accordingly.
     - Use AI tools as aids to enhance productivity and creativity, rather than replacing human judgment and expertise.
  - #### What are some security considerations to be aware of when using tools like Github Copilot?
    When using tools like GitHub Copilot, developers should be aware of potential security risks, such as:
     - Data Privacy: Ensuring that sensitive or confidential information is not shared in code snippets or prompts.
     - Code Vulnerabilities: Reviewing the generated code for security vulnerabilities, such as injection attacks or buffer overflows.
     - Intellectual Property: Being mindful of copyright and licensing issues when using code snippets generated by Copilot.
     - Model Bias: Being aware of biases in the AI model that may influence the generated code and taking steps to mitigate bias in the output.
