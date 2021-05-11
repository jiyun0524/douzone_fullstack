import React from 'react';

class LifecycleExample extends React.Component {
  static getDerivedStateFromProps() {
    console.log('getDerivedStateFromProps call');
    return {};
  }
  constructor(props) {
    super(props);
   
    this.state = {};
    console.log('constructor call');
  }
  componentDidMount() {
    console.log('componentDidMount call');
    this.forceUpdate();
  }
  componentDidUpdate() {
    console.log('componentDidUpdate call');
  }
  componentWillUnmount() {
    console.log('componentWillUnmount call');
  }
  getSnapshotBeforeUpdate() {
    console.log('getSnapshotBeforeUpdate call');
    return {};
  }
  shouldComponentUpdate() {
    console.log('shouldComponentUpdate call');
    return false;
  }
  render() {
    console.log('render call');
    return null;
  }
}

export default LifecycleExample;
