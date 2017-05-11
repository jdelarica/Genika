# Project Work Genika

This is the project repository for Genika. The Team is made up by:

| ![Carla Brugulat](/img/Carla.JPG) | ![Javier de la Rica](/img/Javier.JPG) | ![Montse Sanahuja](/img/Montse.JPG) | ![Joan Sansa](/img/Joan.JPG) | ![Christian Segovia](/img/Christian.JPG) | ![Alex Kim](/img/Alex.JPG) | ![Chao-Feng Wang](/img/Chao.JPG) |
| :---: | :---: | :---: | :---: | :---: | :---: | :---: |
| Carla Brugulat | Javier de la Rica | Montse Sanahuja | Joan Sansa | Christian Segovia | Alex Kim | Chao-Feng Wang |

It is going to be explained below what [Genika](http://genikateam.weebly.com) has been done during the PAE course at UPC at Spring 2017.

![Universitat Politècnica de Catalunya](/img/upc_etsetb.jpg)

 The main aim of the current project is to achieve a real time facial detection in order to create a personalized  avatar the user would be able to play with.
 
 # Stage 1 - Android
 
 The team computed an Android Application that has access to the main and the frontal camera. The App has also a GET AVATAR button, which takes a picture and saves it, so later it computes the avatar and shows it on the device's screen.
 The team has also computed the main page of the Android Application with a simple Login page, a button tu directly open the frontal camera and a link to Genika's website with the logo.
 
 ![App-1](/img/App-1.jpeg) ![App-2](/img/App2-jpeg)
 
 # Stage 2 - Face Detection
 
 Genika has been able to execute the [Dlib C++ library](http://dlib.net). Dlib is a C++ toolkit containing machine learning algorithms complex software. The team used it to detect the user's face, and observed that it detects different faces in a single image in a prevcise way. Furthermore, Genika has tried several images with different characteristics in order to see the strength of the algorithm, studying at the same time the Dlib code.
 The system detects the faces even if they are dark, and even if the person wars glasses or the picture is blurry or Black and White.
	
### Results
					From 92 desirable faces to detect:
						- 80 faces detected.
						- 12 faces not detected.
  
					    | ACCURACY = 80/92 = 86.95% |
![Perc](/img/perc.JPG)	

**Figure 1.** *Percentages of the Dlib and App tests.* 			
 
 The system also extracts a [.txt file](https://www.dropbox.com/s/oqz4kxj6oj976oq/landmarks.txt?dl=0) with the landmarks of each point of the face detection. Genika worked on a simple Matlab code studying the way to modify the presentation of these landmarks and make a proper use of them, so later it would be used in the 3D Meshing stage.
 
 ```
0.Point(555, 275)	17.Point(564, 245)	35.Point(669, 309)	52.Point(666, 334)
1.Point(560, 303) 	18.Point(570, 226)	36.Point(583, 261)	53.Point(685, 334)
2.Point(568, 330)	19.Point(585, 215)	37.Point(592, 252)	54.Point(702, 337)
3.Point(577, 355)	20.Point(603, 211)	38.Point(606, 248)	55.Point(692, 361)
4.Point(590, 378)	21.Point(622, 213)	39.Point(619, 254)	56.Point(677, 377)
5.Point(606, 399)	22.Point(650, 206)	40.Point(608, 262)	57.Point(663, 383)
6.Point(624, 418)	23.Point(669, 196)	41.Point(594, 265)	58.Point(651, 384)
7.Point(647, 429)	24.Point(689, 192)	42.Point(671, 241)	59.Point(635, 378)
8.Point(673, 428)	25.Point(709, 195)	43.Point(682, 231)	60.Point(625, 359)
9.Point(696, 418)	26.Point(723, 208)	44.Point(696, 229)	61.Point(645, 350)
10.Point(716, 398)	27.Point(638, 236)	45.Point(707, 233)	62.Point(657, 348)
11.Point(734, 376)	28.Point(639, 258)	46.Point(699, 241)	63.Point(669, 343)
12.Point(747, 352)	29.Point(640, 279)	47.Point(685, 243)	64.Point(696, 340)
14.Point(754, 297)	30.Point(642, 301)	48.Point(619, 359)	65.Point(672, 361)
13.Point(753, 324)	31.Point(631, 320)	49.Point(630, 348)	66.Point(660, 366)
15.Point(754, 269)	32.Point(640, 321)	50.Point(643, 340)	67.Point(648, 367)
16.Point(752, 240)	34.Point(659, 315)	51.Point(655, 340)
```
 
 
 
 ```matlab
 function landmarkplot = landmarkplot2();
filename = fullfile('landmarks.txt');
 fileID = fopen(filename);
 C = textscan(fileID,'%f %s %s','Delimiter','.');
 index = C{1}, landmarks = C{2};
 
 xvector=zeros(68,1);
 yvector=zeros(68,1);
 for i=1:68
 celda=strjoin(landmarks(i,1));
 celda= strrep(celda,'Point(','');
 celda= strrep(celda,')', '' );
 celda = strsplit(celda, ',');
 X = celda{1}, Y = celda{2};
 X = str2num(X);
 Y = str2num(Y);
 xvector(i,1)=X;
 yvector(i,1)=Y;
 end
 scatter(xvector,yvector);
end
```

![68landmarks](/img/landmarks.JPG)

 **Figure 2.** *Landmarks detection and classification.* 
 
 # Stage 3 - 3D Meshing
 
 From the 68 landmarks detected in the images, the team wants to extract these points and place them in a 3D Model in such a way that the image fits into it. The team has designed a 3D model using [Blender](https://www.blender.org/). Blender is an open source 3D creation suite that supports the entirety of the 3D pipeline-modeling, animation and simulation.
 Genika computed an Android Application which shows the 3D model and it allows to load the images into the model.
 
 ![3Dmodel](/img/3Dmodel.JPG) ![3Dmodel1](/img/3Dmodel1.jpeg)
 # Stage 4 - Integration
 
 
