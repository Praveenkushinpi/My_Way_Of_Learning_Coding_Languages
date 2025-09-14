gsap.registerPlugin(SplitText);
gsap.registerPlugin(ScrollTrigger);
const container = document.getElementById("rain-container");
const images = [
  "./images/hearts.png",
  "./images/starspastel.webp",
  "./images/marks.webp",
  "./images/doughnut.webp",
  "./images/cupcake.png",
  "./images/macaroon.png",
];
let splitHero = SplitText.create(".Hello", { type: "chars" });
let splitLinks = SplitText.create(".Links", { type: "words" });

gsap.from(splitHero.chars, {
  y: 20,
  autoAlpha: 0,
  stagger: 0.05,
  duration: 0.4,
  ease: "power2.out",
});

gsap.from(splitLinks.words, {
  y: -100,
  opacity: 0,
  rotation: "random(-80, 80)",
  duration: 0.7,
  ease: "back",
  stagger: 0.15,
  delay: 1,
});

function makeRain() {
  for (let i = 0; i < 15; i++) {
    const img = document.createElement("img");
    img.src = images[Math.floor(Math.random() * images.length)];
    img.classList.add("raindrop");

    // random x position within viewport
    gsap.set(img, {
      x: gsap.utils.random(0, window.innerWidth - 80),
      y: -100, // start *above* the screen
    });

    container.appendChild(img);

    gsap.to(img, {
      y: window.innerHeight - 80, // settle at bottom of viewport
      duration: gsap.utils.random(2, 4),
      ease: "bounce.out",
      delay: i * 0.2,
    });
  }
}

makeRain();
