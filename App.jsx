import React, { useState } from 'react';

function App() {
  const [color, setColor] = useState('');

  const handleColor = (selectedColor) => {
    setColor(selectedColor);
    document.body.style.backgroundColor = selectedColor;
  };

  return (
    <div style={{ textAlign: 'center', padding: '50px' }}>
      <h1>React Color Selector</h1>

      <button onClick={() => handleColor('red')}>
        Red
      </button>

      <button onClick={() => handleColor('blue')}>
        Blue
      </button>

      <button onClick={() => handleColor('green')}>
        Green
      </button>

      <button onClick={() => handleColor('yellow')}>
        Yellow
      </button>

      {color && (
        <h2>You have selected {color} color.</h2>
      )}
    </div>
  );
}

export default App;