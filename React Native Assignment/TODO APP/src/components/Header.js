import React from 'react';
import { StyleSheet, Text, View } from 'react-native';

export default class Header extends React.Component {

    render() {

        return (
            <View style={styles.header}>
                <Text style={styles.text}>To Do List React-Native Assignment</Text>
            </View>
        );

    }

}

const styles = StyleSheet.create({
    header: {
        width: '100%',
        height: '20%',
        borderBottomWidth: 5,
        borderBottomColor: "#ddd",
        alignItems: 'center',
        justifyContent: 'center',
        backgroundColor: '#FFD700'
    },
    text: {
        fontSize: 20,
        fontWeight: 'bold',
        color: 'black'
    }
});