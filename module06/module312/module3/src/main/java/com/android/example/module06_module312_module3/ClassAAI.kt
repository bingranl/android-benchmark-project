package com.android.example.module06_module312_module3

@Suppress("UNUSED_PARAMETER")
class ClassAAI {
	private 	val instance_var_1_0: com.android.example.module06_module246.ClassAAB = com.android.example.module06_module246.ClassAAB()
	private 	val instance_var_1_1: com.android.example.module06_module246.ClassAAJ = com.android.example.module06_module246.ClassAAJ()
	private 	val instance_var_1_2: com.android.example.module06_module246.ClassAAC = com.android.example.module06_module246.ClassAAC()

	fun method0(
		param0: com.android.example.module06_module246.ClassAAG,
		param1: com.android.example.module06_module246.ClassAAE,
		param2: com.android.example.module06_module246.ClassAAF,
		param3: com.android.example.module06_module246.ClassAAF
	) {
		for (iAb in 0..6) {
			for (iAc in 0..2) {
				param0.method1(dagger.internal.DelegateFactory(), dagger.internal.DelegateFactory())

				val local_var_4_0: androidx.collection.CircularIntArray = androidx.collection.CircularIntArray()
				local_var_4_0.popLast()

				val local_var_4_1: dagger.internal.DelegateFactory<kotlin.Any> = dagger.internal.DelegateFactory()
				local_var_4_1.get()

			}
		}
	}

	fun method1(
		param0: com.android.example.module06_module246.ClassAAJ,
		param1: com.android.example.module06_module246.ClassAAA,
		param2: com.android.example.module06_module246.ClassAAJ,
		param3: com.android.example.module06_module246.ClassAAB
	) {
		val local_var_2_4: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
		local_var_2_4.cancel()

		param0.method0(io.reactivex.subscribers.TestSubscriber(), dagger.internal.DelegateFactory(), io.reactivex.subscribers.TestSubscriber(), dagger.internal.DelegateFactory())

		val local_var_2_5: androidx.core.os.CancellationSignal = androidx.core.os.CancellationSignal()
		local_var_2_5.getCancellationSignalObject()

		param0.method1(io.reactivex.subscribers.TestSubscriber(), io.reactivex.subscribers.TestSubscriber())

	}
}
