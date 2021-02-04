package com.android.example.module02_module37_module27_module2

@Suppress("UNUSED_PARAMETER")
class ClassAAI {
	private 	val instance_var_1_0: com.android.example.module02_module37_module27_module3.ClassAAA = com.android.example.module02_module37_module27_module3.ClassAAA()
	private 	val instance_var_1_1: com.android.example.module02_module37_module27_module3.ClassAAA = com.android.example.module02_module37_module27_module3.ClassAAA()
	private 	val instance_var_1_2: com.android.example.module02_module37_module27_module3.ClassAAF = com.android.example.module02_module37_module27_module3.ClassAAF()
	private 	val instance_var_1_3: com.android.example.module02_module37_module27_module1.ClassAAI = com.android.example.module02_module37_module27_module1.ClassAAI()
	private 	val instance_var_1_4: com.android.example.module02_module37_module27_module3.ClassAAD = com.android.example.module02_module37_module27_module3.ClassAAD()

	fun method0(
		param0: com.android.example.module02_module37_module27_module3.ClassAAC,
		param1: com.android.example.module02_module37_module27_module3.ClassAAE
	) {
		param0.method1("SomeString", "SomeString", "SomeString")

		for (iAb in 0..5) {
			listOf("1", "2", "3").forEach {
				val local_var_4_0: io.reactivex.internal.queue.MpscLinkedQueue<kotlin.Any> = io.reactivex.internal.queue.MpscLinkedQueue()
				local_var_4_0.offer(kotlin.Any())

			}
			val local_var_3_0: io.reactivex.internal.queue.MpscLinkedQueue<kotlin.Any> = io.reactivex.internal.queue.MpscLinkedQueue()
			local_var_3_0.offer(kotlin.Any())

		}
		val local_var_2_2: io.reactivex.schedulers.TestScheduler = io.reactivex.schedulers.TestScheduler()
		local_var_2_2.createWorker()

	}

	fun method1(
		param0: com.android.example.module02_module37_module27_module1.ClassAAA,
		param1: com.android.example.module02_module37_module27_module1.ClassAAG
	) {
		param0.method3(com.android.example.module02_module37_module27_module3.ClassAAA(), com.android.example.module02_module37_module27_module3.ClassAAG(), com.android.example.module02_module37_module27_module3.ClassAAJ())

		param0.method1(com.android.example.module02_module37_module27_module3.ClassAAC())

		val local_var_2_2: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
		local_var_2_2.dispose()

	}

	fun method2(
		param0: com.android.example.module02_module37_module27_module3.ClassAAA,
		param1: com.android.example.module02_module37_module27_module3.ClassAAF,
		param2: com.android.example.module02_module37_module27_module3.ClassAAE,
		param3: com.android.example.module02_module37_module27_module3.ClassAAF
	) {
		param0.method0("SomeString")

		val local_var_2_4: io.reactivex.internal.queue.MpscLinkedQueue<kotlin.Any> = io.reactivex.internal.queue.MpscLinkedQueue()
		local_var_2_4.poll()

		val local_var_2_5: io.reactivex.internal.queue.MpscLinkedQueue<kotlin.Any> = io.reactivex.internal.queue.MpscLinkedQueue()
		local_var_2_5.clear()

		param0.method0("SomeString")

	}
}
