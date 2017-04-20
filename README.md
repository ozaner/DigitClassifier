# Digit Classifier
#### An Android app demoing Tensorflow integration in Java.

This app can classify handwritten digits (0-9) drawn on the screen.
It was created by implementing a model coded with Tensorflow in Python
and then serving that file via the Tensorflow Inference java library.

##### Example:

<img src="/test2.png" width="400"/> <img src="/test3.png" width="400"/>

App coded in **Java SE 8** with:
- Google's [*Android SDK*](https://www.android.com/)
- Google's [*TensorflowInference*](https://github.com/tensorflow/tensorflow/tree/master/tensorflow/java) Library

Model [(src)](https://github.com/ozanerhansha/NeuralNetworks/blob/master/src/MNIST/mnist_convolutional.py) coded in **Python 3.5** with:
- Google's [*TensorFlow*](https://www.tensorflow.org/)
