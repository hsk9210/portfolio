

function BoilingVerdict(props) {
    if(props.celsius >= 100) {
        return <p>the water would biol.</p>;
    }
    return <p>the water would not boil.</p>;
}

export default BoilingVerdict;
