<div style="font-family : Kristen ITC; background : black;">  
<marquee><font size="24" color="white">

Welcome To Shanto's <mark>LibGDX</mark> Blog

</font></marquee></div>


---

A Java Game Engine Codes

---


## 01: Creating fonts and drawing texts in LibGdx

- At the time of building the project, make sure that ___"Tools"___ is selected from the menu.
- Run __Heiro class__.
- Select a font from there and convert it to "--.font" file and add it to the assets folder.



## 02, 03: Handling Mouse, Keyboard & Touch Input

- It can be done in two ways
	i. By using ___Gdx.input.isKeyPressed(Input.Keys.key_name)___ as a logic parameter inside the __render()__ method
	ii. By implementing __InputProcessor__ interface and _@Overddiding_ all of its methods


## 04, 05: Audio

- LibGDX supports 3 audio formats: ___ogg___, _**mp3**_ and **_wav_**.
- MP3 is a format that is mired in legal issues, while WAV is a rather large ( file size ) format, leaving OGG as often the best choice.
- Recording is also available in LibGDX.

## 06, 07: Camera & Viewport

* ___Camera___ – eye in the scene, determines what the player can see, used by LibGDX to render the scene.
* ___Viewport___ – controls how the render results from the camera are displayed to the user, be it with black bars, stretched or doing nothing at all.

<br>

- In LibGDX there are two kinds of cameras, the ___PerspectiveCamera___ and the ___OrthographicCamera___.
- Both are very big words and somewhat scary, but neither needs to be.
- First and foremost, if you are working on a ___2D game___, there is a _99.9%_ chance you want an ___Orthographic camera___, while if you are working in __3D__, you most likely ( but not always ) want to use a ___Perspective camera___.

<br>

- Using a camera has a couple of advantages.
	- It gives you an easier way of dealing with device resolution as LibGDX will scale the results up to match your device resolution.
	- It also makes it easier to move the view around when your scene is larger than a single screen.

<br>

- There are a number of different Viewports available:
	- ExtendViewport 
	- FillViewport 
	- FitViewport
	- StretchViewport
	- ScreenViewport











